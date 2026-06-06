package com.earlysleep.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        setTitle("贪吃蛇");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        GamePanel panel = new GamePanel();
        add(panel);
        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}

class GamePanel extends JPanel implements ActionListener {

    private static final int TILE_SIZE = 25;
    private static final int BOARD_WIDTH = 600;
    private static final int BOARD_HEIGHT = 600;

    private final ArrayList<Point> snake = new ArrayList<>();
    private Point food;
    private char direction = 'R';
    private boolean running = false;
    private boolean gameOver = false;
    private int score = 0;
    private Timer timer;
    private final Random random = new Random();

    private static final int INITIAL_DELAY = 150;

    public GamePanel() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (gameOver) {
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        restartGame();
                    }
                    return;
                }
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') direction = 'L';
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') direction = 'R';
                        break;
                    case KeyEvent.VK_UP:
                        if (direction != 'D') direction = 'U';
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') direction = 'D';
                        break;
                }
            }
        });
        startGame();
    }

    private void startGame() {
        snake.clear();
        snake.add(new Point(5, 5));
        snake.add(new Point(4, 5));
        snake.add(new Point(3, 5));
        direction = 'R';
        score = 0;
        running = true;
        gameOver = false;
        spawnFood();
        if (timer != null) timer.stop();
        timer = new Timer(INITIAL_DELAY, this);
        timer.start();
    }

    private void restartGame() {
        startGame();
    }

    private void spawnFood() {
        Point newFood;
        do {
            newFood = new Point(random.nextInt(BOARD_WIDTH / TILE_SIZE),
                                random.nextInt(BOARD_HEIGHT / TILE_SIZE));
        } while (snake.contains(newFood));
        food = newFood;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkCollision();
            checkFood();
        }
        repaint();
    }

    private void move() {
        Point head = new Point(snake.get(0));
        switch (direction) {
            case 'U': head.y--; break;
            case 'D': head.y++; break;
            case 'L': head.x--; break;
            case 'R': head.x++; break;
        }
        snake.add(0, head);
        snake.remove(snake.size() - 1);
    }

    private void checkFood() {
        if (snake.get(0).equals(food)) {
            score += 10;
            snake.add(new Point(snake.get(snake.size() - 1)));
            spawnFood();
            if (score % 50 == 0 && timer.getDelay() > 50) {
                timer.setDelay(timer.getDelay() - 10);
            }
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);

        if (head.x < 0 || head.x >= BOARD_WIDTH / TILE_SIZE ||
            head.y < 0 || head.y >= BOARD_HEIGHT / TILE_SIZE) {
            running = false;
            gameOver = true;
            timer.stop();
        }

        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
                gameOver = true;
                timer.stop();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (running) {
            drawGame(g);
        } else if (gameOver) {
            drawGameOver(g);
        }
    }

    private void drawGame(Graphics g) {
        // 绘制网格
        g.setColor(new Color(30, 30, 30));
        for (int i = 0; i < BOARD_WIDTH / TILE_SIZE; i++) {
            g.drawLine(i * TILE_SIZE, 0, i * TILE_SIZE, BOARD_HEIGHT);
            g.drawLine(0, i * TILE_SIZE, BOARD_WIDTH, i * TILE_SIZE);
        }

        // 绘制食物
        g.setColor(Color.RED);
        g.fillOval(food.x * TILE_SIZE + 2, food.y * TILE_SIZE + 2,
                   TILE_SIZE - 4, TILE_SIZE - 4);

        // 绘制蛇
        for (int i = 0; i < snake.size(); i++) {
            Point p = snake.get(i);
            if (i == 0) {
                g.setColor(new Color(0, 200, 0));
            } else {
                g.setColor(new Color(0, 255, 0));
            }
            g.fillRoundRect(p.x * TILE_SIZE + 1, p.y * TILE_SIZE + 1,
                            TILE_SIZE - 2, TILE_SIZE - 2, 8, 8);
        }

        // 绘制蛇眼
        drawSnakeEyes(g);

        // 绘制分数
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.BOLD, 18));
        g.drawString("得分: " + score, 10, 25);
    }

    private void drawSnakeEyes(Graphics g) {
        Point head = snake.get(0);
        int eyeSize = 5;
        g.setColor(Color.WHITE);

        switch (direction) {
            case 'R':
                g.fillOval(head.x * TILE_SIZE + 14, head.y * TILE_SIZE + 5, eyeSize, eyeSize);
                g.fillOval(head.x * TILE_SIZE + 14, head.y * TILE_SIZE + 14, eyeSize, eyeSize);
                break;
            case 'L':
                g.fillOval(head.x * TILE_SIZE + 5, head.y * TILE_SIZE + 5, eyeSize, eyeSize);
                g.fillOval(head.x * TILE_SIZE + 5, head.y * TILE_SIZE + 14, eyeSize, eyeSize);
                break;
            case 'U':
                g.fillOval(head.x * TILE_SIZE + 5, head.y * TILE_SIZE + 5, eyeSize, eyeSize);
                g.fillOval(head.x * TILE_SIZE + 14, head.y * TILE_SIZE + 5, eyeSize, eyeSize);
                break;
            case 'D':
                g.fillOval(head.x * TILE_SIZE + 5, head.y * TILE_SIZE + 14, eyeSize, eyeSize);
                g.fillOval(head.x * TILE_SIZE + 14, head.y * TILE_SIZE + 14, eyeSize, eyeSize);
                break;
        }
    }

    private void drawGameOver(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.BOLD, 36));
        String gameOverText = "游戏结束";
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString(gameOverText, (BOARD_WIDTH - metrics.stringWidth(gameOverText)) / 2,
                     BOARD_HEIGHT / 2 - 50);

        g.setFont(new Font("微软雅黑", Font.BOLD, 24));
        String scoreText = "最终得分: " + score;
        metrics = getFontMetrics(g.getFont());
        g.drawString(scoreText, (BOARD_WIDTH - metrics.stringWidth(scoreText)) / 2,
                     BOARD_HEIGHT / 2);

        g.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        String restartText = "按 空格键 重新开始";
        metrics = getFontMetrics(g.getFont());
        g.drawString(restartText, (BOARD_WIDTH - metrics.stringWidth(restartText)) / 2,
                     BOARD_HEIGHT / 2 + 50);
    }
}

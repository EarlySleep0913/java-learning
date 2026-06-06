package com.earlysleep.variable;

public class VariableDemo2 {

    public static void main(String[] args) {

        /*
        我方:叉子                 对方:长手
        攻击:220                  攻击:210
        防御:85                   防御:80
        血量:1012.5               血量:1223.3
        技能加成:1.2              技能加成:1.3

        技能造成伤害的公式:
        攻击力*技能加成-对方防御力
        普攻造成伤害的公式:
        攻击力-对方防御力
        计算:
        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量?
        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量?
        */

        //定义变量记录我方各项属性
        double myAttack = 220;
        double myDefense = 85;
        double myHp = 1012.5;
        double mySkillAdd = 1.2;

        //定义变量记录对方各项属性
        double enemyAttack = 210;
        double enemyDefense = 80;
        double enemyHp = 1223.3;
        double enemySkillAdd = 1.3;

        //计算我方第一次普通攻击造成的伤害
        double myAttackDamage = myAttack - enemyDefense;
        enemyHp -= myAttackDamage;
        System.out.println("我方普通攻击造成伤害：" + myAttackDamage);
        System.out.println("对方剩余血量：" + enemyHp);

        //计算我方第二次技能攻击造成的伤害
        double mySkillDamage = myAttack * mySkillAdd - enemyDefense;
        enemyHp -= mySkillDamage;
        System.out.println("我方技能攻击造成伤害：" + mySkillDamage);
        System.out.println("对方剩余血量：" + enemyHp);


    }
}

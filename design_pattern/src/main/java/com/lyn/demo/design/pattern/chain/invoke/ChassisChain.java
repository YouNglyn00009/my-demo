package com.lyn.demo.design.pattern.chain.invoke;

import com.lyn.demo.design.pattern.chain.abstracts.AbstractCarChain;

/**
 * @Description 底盘处理
 */
public class ChassisChain extends AbstractCarChain {
    @Override
    public void doChain() {
        System.out.println("ChassisChain-底盘处理");
        this.setNextChainAndDoChain(new LogoChain());
    }
}

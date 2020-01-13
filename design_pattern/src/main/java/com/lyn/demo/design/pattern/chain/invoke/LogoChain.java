package com.lyn.demo.design.pattern.chain.invoke;

import com.lyn.demo.design.pattern.chain.abstracts.AbstractCarChain;

/**
 * @Description LOGO处理
 */
public class LogoChain extends AbstractCarChain {

    @Override
    public void doChain() {
        System.out.println("LogoChain->LOGO处理");
        this.setNextChainAndDoChain(new TyreChain());
    }
}

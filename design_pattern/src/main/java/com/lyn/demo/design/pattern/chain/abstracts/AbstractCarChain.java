package com.lyn.demo.design.pattern.chain.abstracts;


/**
 * @Description 抽象责任链
 */
public abstract class AbstractCarChain {

    private AbstractCarChain nextChain;

    public void setNextChainAndDoChain(AbstractCarChain nextChain) {
        this.nextChain = nextChain;
        this.nextChain.doChain();
    }

    public abstract void doChain();
}

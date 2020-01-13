package com.lyn.demo.design.pattern.chain.invoke;

import com.lyn.demo.design.pattern.chain.abstracts.AbstractCarChain;

/**
 * @Description 轮胎处理
 */
public class TyreChain extends AbstractCarChain {

    @Override
    public void doChain() {
        System.out.println("TyreChain->轮胎处理");
    }
}

package com.lyn.demo.design.pattern.template.index;

/**
 * @Description
 */
public abstract class AbstractIndexStrategy<DATASOURCE, VALIDATION_SERVICE> implements IndexStrategy<DATASOURCE, VALIDATION_SERVICE> {

    private IndexStrategy<DATASOURCE, VALIDATION_SERVICE> nextIndex;

    @Override
    public IndexStrategy<DATASOURCE, VALIDATION_SERVICE> next() {
        return this.nextIndex;
    }

    @Override
    public void setNext(IndexStrategy<DATASOURCE, VALIDATION_SERVICE> nextIndex) {
        this.nextIndex = nextIndex;
    }

}

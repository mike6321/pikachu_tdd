package com.github.fourteam.pikachu.week1.imesung.domain.product;

public class BuilderProduct {
    private Product product;

    public BuilderProduct() {
        this.product = new Product(0, 0, 0, 0);
    }

    public static BuilderProduct start() {
        return new BuilderProduct();
    }

    public BuilderProduct setPrdCd(int prdCd) {
        product.setPrdCd(prdCd);
        return this;
    }

    public BuilderProduct setPrdPrc(int prdPrc) {
        product.setPrdPrc(prdPrc);
        return this;
    }

    public BuilderProduct setGfitNo(int giftNo) {
        product.setGiftNo(giftNo);
        return this;
    }

    public BuilderProduct setStock(int stock) {
        product.setStock(stock);
        return this;
    }

    public Product build() {
        return this.product;
    }
}

package ru.netology.domain;

public class Goods {
    private long id;
    private String[] imageId;
    private String[] nameURL;
    private String allGoods;
    private int goodsCount;
    private int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String[] getImageId() {
        return imageId;
    }

    public void setImageId(String[] imageId) {
        this.imageId = imageId;
    }

    public String[] getNameURL() {
        return nameURL;
    }

    public void setNameURL(String[] nameURL) {
        this.nameURL = nameURL;
    }

    public String getAllGoods() {
        return allGoods;
    }

    public void setAllGoods(String allGoods) {
        this.allGoods = allGoods;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

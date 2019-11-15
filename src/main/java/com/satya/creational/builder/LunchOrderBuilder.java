package com.satya.creational.builder;

public class LunchOrderBuilder {
    private final String bread;
    private final String confiments;
    private final String dreassing;
    private final String meat;

    public static class Builder{
        private String bread;
        private String confiments;
        private String dreassing;
        private String meat;

        public Builder() {
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder confiments(String confiments){
            this.confiments = confiments;
            return this;
        }

        public Builder dreassing(String dreassing){
            this.dreassing = dreassing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }

        public LunchOrderBuilder build(){
            return new LunchOrderBuilder(this);
        }
    }

    public LunchOrderBuilder(Builder builder) {
        this.bread = builder.bread;
        this.confiments = builder.confiments;
        this.dreassing = builder.dreassing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getConfiments() {
        return confiments;
    }

    public String getDreassing() {
        return dreassing;
    }

    public String getMeat() {
        return meat;
    }

}

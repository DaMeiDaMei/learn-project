package org.chinalife.supervision.common.enums;

/**
 * 关系人类型常量枚举类:plcInsurant.CustomerType
 * 
 * @author shihuan
 *
 */
public enum CustomerTypeEum {
    /**
     * AutoLine
     */
    AutoLine("1","投保人"),
    /**
     * LiabLine
     */
    LiabLine("2","被保险人");

    /** value */
    private String value;

    /** name */
    public String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String fieldName) {
        this.name = name;
    }

    /**
     * CustomerTypeEum
     * @param value value
     * @param name name
     */
    private CustomerTypeEum(String value , String name) {
        this.value = value;
        this.name = name;

    }
    
}


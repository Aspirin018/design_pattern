package design.pattern.creational.singleton.enumsingleton;

/**
 * 枚举实现单例
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

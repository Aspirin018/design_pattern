package design.principle.interfacesegregation.v1;

/**
 * 违背接口隔离原则的接口
 */
public interface IAnimal {
    //不是每一个动物都有这三种行为
    void eat();
    void fly();
    void swim();
}

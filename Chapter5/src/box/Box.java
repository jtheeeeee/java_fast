package box;

public class Box <T extends Fruit>{
    T item;

    @Override
    public String toString() {
        return "이 박스는 "+item.getName()+"박스입니다.";
    }

    void setItem(T item){
        this.item=item;
    }
    T getItem(){
        return item;
    }
}

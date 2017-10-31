public class GenericArrayList<Type> {

    Type[] typeArray;

    public GenericArrayList() {
        this.typeArray = (Type[]) new Object[0];
    }

    public void add(Type item) {
        Type[] newTypeArray = (Type[]) new Object[typeArray.length+1];
        for (int i = 0; i < typeArray.length; i++) {
            newTypeArray[i] = typeArray[i];
        }
        newTypeArray[typeArray.length] = item;
        typeArray = newTypeArray;
    }

    public Type get(int index) {
        if (index >= typeArray.length) {
            throw new RuntimeException("Invalid index");
        }
        return typeArray[index];
    }

    public Integer size() {
        return typeArray.length;
    }

    public void remove(int index) {
        Type[] newTypeArray = (Type[]) new Object[typeArray.length-1];
        for (int i = 0; i < index; i++) {
            newTypeArray[i] = typeArray[i];
        }
        for (int i = index+1; i < typeArray.length; i++) {
            newTypeArray[i-1] = typeArray[i];
        }
        typeArray = newTypeArray;
    }


}

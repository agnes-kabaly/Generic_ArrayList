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
        return typeArray[index];
    }

    public Integer size() {
        return typeArray.length;
    }


}

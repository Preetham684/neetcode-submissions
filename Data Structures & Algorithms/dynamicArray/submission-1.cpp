class DynamicArray {
public:
    int *array;
    int length;
    int capacity;

    DynamicArray(int capacity) {
        this->capacity = capacity;
        length = 0;
        array = new int[capacity];
    }

    int get(int i) {
        return array[i];

    }

    void set(int i, int n) {
        array[i] = n;

    }

    void pushback(int n) {
        if(length == capacity){
            resize();
        }

        //add the element to the array
        array[length] = n;
        length++;

    }

    int popback() {
        if(length==0){
            printf("There is nothing to remove.\n");
        }
        return array[--length];

    }

    void resize() {
        capacity = capacity *2;
        int *newArray = new int[capacity];

        for(int i=0; i<length; i++){
            newArray[i] = array[i];
        }

        array = newArray;

    }

    int getSize() {
        return length;

    }

    int getCapacity() {
        return capacity;
    }
};

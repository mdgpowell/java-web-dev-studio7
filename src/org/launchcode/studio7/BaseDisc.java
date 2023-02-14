package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private String data;
    public int storageCapacity;

    public BaseDisc(String name, int storageCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void reportData() {
        System.out.println("name: "+ name + "\n Storage Capacity: " + storageCapacity);
    }
    public void playAudio() {
        System.out.println("Played audio!");
    }
    public abstract boolean isFull();
    public abstract String readData();
    public abstract void writeData(String data);

}

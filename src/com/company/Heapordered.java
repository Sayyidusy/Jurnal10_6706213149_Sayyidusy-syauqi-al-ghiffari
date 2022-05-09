package com.company;

public class Heapordered {
    int arr [];
    int size;
    public Heapordered (int arr[]) {
        this.arr = arr;
        this.size = arr.length;

        buildHeap(); //panggil buildheap nya
    }

    //fungsi buildheap
    //metode build heap akan diulang pada semua elemen

    void buildHeap() {
        //disini memiliki yang pertama node yang bukan leaf dan sementara i lebih besar dari sama dengan nol
        for(int i=this.size/2-1; i>=0; i--) {
            heapify(i);
        }
    }

    //tipe pengembalian jadi tipe data pengembalian
    // indeks root
    // dan dengan indeks root ini ia akan mencoba cari tahu child kiri dan kanan

    void heapify(int root_index){
        int max_index = root_index;
        int child = root_index*2+1;

        //memerikasa child yang valid atau tidak
        if(child<size) {
            if(arr[child] > arr[root_index]){
                max_index = child;
            }
        }
        // methode if , menaruh child ke kiri atau kanan
        if(child+1<size){
            if(arr[child+1]>arr[max_index]){
                max_index = child+1;
            }
        }

        //akan menukar nilai max dengan node root
        swap(arr, root_index, max_index);
        //memeriksa apakah indeks root
        //sudah berubah
        if(root_index != max_index){
            heapify(max_index);
        }
    }

    void swap (int arr [], int a, int b){
        int temp = arr[a];
        arr [a]= arr[b];
        arr [b] = temp;
    }


    //mengeluarkan elemen max
    int extractRoot (){
        int max = arr[0];
        arr [0]= arr[--size];
        heapify(0);

        return max;
    }

    //mendapatkan size
    //mengembalikan size dan menggunakan methode extractroot di atas
    int getSize() {
        return  size;
    }
}


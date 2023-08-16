package br.com.xti.refined;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

    public static long loadMemory(){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<100_000; i++){
            list.add(i);
        }
        return Runtime.getRuntime().freeMemory();
    }

    public static void main(String[] args) {

        // Demo Garbage Collector
        Runtime runtime = Runtime.getRuntime();
        int MB = 1_048_578;
        double total = runtime.maxMemory() / MB;

        double beginning = total -(loadMemory() / MB);

        runtime.runFinalization();
        runtime.gc();

        double ending = total - (Runtime.getRuntime().freeMemory() / MB);

        System.out.println("beginning " + beginning);
        System.out.println("ending " + ending);

    }
}

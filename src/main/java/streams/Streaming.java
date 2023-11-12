package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Streaming {
    public static void main(String[] args) {
        /*List<Integer> inetgers = Arrays.asList(0,3,2,6,4,53,36,242,367,45,468,2,7,4);
        inetgers.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
       int mxa =  inetgers.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
        System.out.println("Maximum Value " + mxa);

        String abc = "";

        int mni =  inetgers.stream().min(Comparator.comparingInt(Integer::valueOf)).get();
        System.out.println("Minimum Value " + mni);
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,4,5,6};

        System.out.println(Arrays.asList("md"));
        System.out.println("88888888888888888888");
        inetgers.stream().distinct().collect(Collectors.toList());
        System.out.println("Find any");
//        System.out.println(        inetgers.stream().().get());
*//*
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (new String()){
                    System.out.println("locked before try t1");
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){

                    }

                    synchronized (new String()){
                        System.out.println("locked after try t1");

                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (new String()){
                    System.out.println("locked before try t2");

                    try{
                        Thread.sleep(500);
                    }catch (Exception e){

                    }

                    synchronized (new String()){
                        System.out.println("locked after try t2");

                    }
                }
            }
        };


        t1.start();
        t2.start();*//*


        System.out.println('j' + 'a' + 'v' + 'a');
        List<String> abc1 = new ArrayList<>();
        abc1.add("dfd");*/


        Stream<String> s = Stream.of("2", "3", "4", "5", "Qe", "2","4");

        // using Collectors minBy(Comparator comparator)
        // and finding the minimum element
        // in reverse order
        /*Optional<String> obj = s
                .collect(Collectors
                        .maxBy(Comparator
                                .naturalOrder()));*/

        Set<String> oqbj = s
                .collect( Collectors.toSet());

        System.out.println(oqbj);



        // if present, print the element
        // else print the message
       /* if (obj.isPresent()) {
            System.out.println(obj.get());
        } else {
            System.out.println("no value");

        }
*/
    }

}
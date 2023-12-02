package TimeComparison;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeComparison {
    private static int count = 1000;
    private final List<Integer> list;

    public TimeComparison(String type, Integer elem){
        if (type.equals("ArrayList"))
            list = new ArrayList<>();
        else if (type.equals("LinkedList")) {
            list = new LinkedList<>();
        }
        else
            throw new RuntimeException("Unknown type");
        count = elem;
    }

    public List<Integer> getList(){
        return list;
    }

    /**
     * Добавляет count элементов в конец списка
     * и выводит на экран время работы
     */
    public void Add(){
        long begin = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        long result = end - begin;
        System.out.println("Add\t" + count + "\t\t" + result);
    }

    /**
     * Добавляет count элементов в начало списка
     * и выводит на экран время работы
     */
    public void InsertBegin(){
        long begin = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(0, i);
        }
        long end = System.nanoTime();
        long result = end - begin;
        System.out.println("InsertBegin\t" + count + "\t\t" + result);
    }

    /**
     * Уадляет count элементов с начала списка
     * и выводит на экран время работы
     */
    public void RemoveBegin(){
        try{
            long begin = System.nanoTime();
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
            long end = System.nanoTime();
            long result = end - begin;
            System.out.println("RemoveBegin\t" + count + "\t\t" + result);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Удаляет count элементов с конца списка
     * и выводит на экран время работы
     */
    public void RemoveEnd(){
        try{
            long begin = System.nanoTime();
            for (int i = 0; i < count; i++) {
                list.remove(list.size()-1);
            }
            long end = System.nanoTime();
            long result = end - begin;
            System.out.println("RemoveEnd\t" + count + "\t\t" + result);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Получает элемент с начала списка
     * и выводит на экран время работы
     */
    public void GetBegin(){
        try{
            long begin = System.nanoTime();
            int elem = list.get(0);
            long end = System.nanoTime();
            long result = end - begin;
            System.out.println("GetBegin\t" + count + "\t\t" + result);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Получает элемент с конца списка
     * и выводит на экран время работы
     */
    public void GetEnd(){
        try{
            long begin = System.nanoTime();
            int elem = list.get(list.size()-1);
            long end = System.nanoTime();
            long result = end - begin;
            System.out.println("GetEnd\t" + count + "\t\t" + result);

        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Заменяет элемент с начала списка
     * и выводит на экран время работы
     */
    public void SetBegin(){
        try{
            long begin = System.nanoTime();
            list.set(0, 10);
            long end = System.nanoTime();
            long result = end - begin;
            System.out.println("SetBegin\t" + count + "\t\t" + result);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Заменяет элемент с конца списка
     * и выводит на экран время работы
     */
    public void SetEnd(){
        try{
            long begin = System.nanoTime();
            list.set(list.size()-1, 10);
            long end = System.nanoTime();
            long result = end - begin;
            System.out.println("SetEnd\t" + count + "\t\t" + result);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Создает таблицу с результатами времени работы методов
     * заданного списка
     */
    public void table(){
        System.out.println("---------------------" + list.getClass() + "---------------------");
        System.out.println("Method\t\tOperations\tTime");
        InsertBegin();
        GetBegin();
        SetBegin();
        RemoveBegin();
        Add();
        GetEnd();
        SetEnd();
        RemoveEnd();
    }
}

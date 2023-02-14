import java.util.List;
import java.util.ArrayList;

public class RemoverElemento
{
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
        System.out.println("lista completa:" + al);

        al.remove(3);

        System.out.println("lista atualizada : " + al);
    }
}
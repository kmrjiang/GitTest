package Git;

import java.util.ArrayList;
import java.util.Scanner;

public class IParamsSystem implements IParams{
    private int Big;
    private int Medium;
    private int Small;
    private ArrayList<Integer> arrayList;


    IParamsSystem(){
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入大车位数量");
        Big = reader.nextInt();
        System.out.println("请输入中车位数量");
        Medium = reader.nextInt();
        System.out.println("请输入小车位数量");
        Small = reader.nextInt();
        System.out.println("请输入停车顺序");
        System.out.println("请在每次输入车辆后加入英文逗号“,”");
        String parse = reader.next();
        String[] split = parse.split(",");
        arrayList = new ArrayList(Big+Medium+Small);
        for (String s : split){
            int i = Integer.parseInt(s);
            arrayList.add(i);
        }
    }

    @Override
    public int getBig() {
        return Big;
    }

    @Override
    public int getMedium() {
        return Medium;
    }

    @Override
    public int getSmall() {
        return Small;
    }

    @Override
    public ArrayList<Integer> getPlanParking() {
        return arrayList;
    }
}

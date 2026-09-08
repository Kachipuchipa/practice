import java.util.ArrayList;
import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public String[] solution(int[][] line) {

        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        ArrayList<Position> intersections = new ArrayList<>();
        for (int i = 0; i < line.length; i++)
            for (int j = i + 1; j < line.length; j++) {
                Position temp = Intersection(line[i],line[j]);
                if(temp == null) continue;

                intersections.add(temp);

            }



       // System.out.println(intersections);







        String[] answer = {};
        return answer;
    }


    public Position Intersection(int[] line1, int[] line2) {

        int a = line1[0];
        int b = line1[1];
        int e = line1[2];
        int c = line2[0];
        int d = line2[1];
        int f = line2[2];

        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);

        if (!(x % 1 == 0 && y % 1 == 0))
            return null;

        return new Position((long)x,(long)y);

    }


    public static void main(String[] args) {
        Main m = new Main();
        m.solution(new int[][]{{0,1,-1},{1,0,-1},{1,0,1} });
    }

}
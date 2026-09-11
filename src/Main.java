import java.util.ArrayList;
import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public int[] solution(String[][] places) {


        for (String[] p : places) {

            int r = 0, c = 0;
            char[][] place = new char[5][5];

            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++) {
                    place[i][j] = p[i].charAt(j);
                }

            int[][] personXY = findPersonXY(place);
            checkManhathon(personXY);
        }
        int[] answer = {};

        return answer;
    }

    public boolean checkManhathon(int[][] personXY) {
        //TODO
    }

    public  int[][] findPersonXY(char[][] place) {

        ArrayList<int[]> personXY = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(place[i][j] == 'P')
                    personXY.add(new int[]{i, j});
            }
        }

        return personXY.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Main m = new Main();
        //m.solution();
    }

}
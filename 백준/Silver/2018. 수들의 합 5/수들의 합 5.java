import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int s=0, e=0, sum=0, result=0;
        while(s<=N) {
            while(++e<=N) {
                sum += e;
                if(sum>=N) {
                    if(sum==N) result++;
                    break;
                }
            }
            while(++s<=N) {
                sum -= s;
                if(sum<=N) {
                    if(sum==N) result++;
                    break;
                }
            }
        }
        br.close();

        System.out.println(result);
    }

}
import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //<.>
        int[] scores = new int[n]; //<.>
        for(int i = 0; i < n; i++) //<.>
            scores[i] = in.nextInt();
        int max = scores[0]; //<.>
        int min = scores[0];
        int sum = scores[0];
        for(int i = 1; i < n; i++) { //<.>
            if(scores[i] > max)
                max = scores[i];
            if(scores[i] < min)
                min = scores[i];
            sum += scores[i];
        }
        double mean = ((double)sum)/n;
        System.out.println("Maximum:\t\t" + max);
        System.out.println("Minimum:\t\t" + min);
        System.out.println("Mean:\t\t\t" + mean);
        double variance = 0;
        for(int i = 0; i < n; i++)
            variance += (scores[i] - mean)*(scores[i] - mean); //<.>
        variance /= (n - 1); //<.>
        System.out.println("Standard Deviation:\t" + Math.sqrt(variance)); //<.>
        int temp;
        for(int i = 0; i < n - 1; i++) { //<.>
            min = i;
            for(int j = i + 1; j < n; j++)
                if(scores[j] < scores[min])
                    min = j;
            temp = scores[min];
            scores[min] = scores[i];
            scores[i] = temp;
        }
        double median;
        if(n % 2 == 0) //<.>
            median = (scores[n/2] + scores[n/2 + 1])/2.0; //<.>
        else
            median = scores[n/2]; //<.>
        System.out.println("Median:\t\t\t" + median);
    }
}

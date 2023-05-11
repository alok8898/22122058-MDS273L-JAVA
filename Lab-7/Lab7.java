import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Lab7{
    public static void main(String[] args) {
        String iris = "iris.csv";
        String line ="";
        int count=0, setosacount=0, versicolorcount=0, verginicacount=0;
        float[] sepel_length = new float[150];
        float[] sepel_width = new float[150];
        float[] petal_length = new float[150];
        float[] petal_width = new float[150];
        float[] setosa_sepel_length = new float[50];
        float[] setosa_sepel_width = new float[50];
        float[] setosa_petal_length = new float[50];
        float[] setosa_petal_width = new float[50];
        float[] versicolor_sepel_length = new float[50];
        float[] versicolor_sepel_width = new float[50];
        float[] versicolor_petal_length = new float[50];
        float[] versicolor_petal_width = new float[50];
        float[] verginica_sepel_length = new float[50];
        float[] verginica_sepel_width = new float[50];
        float[] verginica_petal_length = new float[50];
        float[] verginica_petal_width = new float[50];
        try{
            BufferedReader br = new BufferedReader(new FileReader(iris));
            br.readLine();
            while((line = br.readLine())!=null){
                String[] values = line.split(",");
                sepel_length[count]=Float.parseFloat(values[1]);
                sepel_width[count]=Float.parseFloat(values[2]);
                petal_length[count]=Float.parseFloat(values[3]);
                petal_width[count]=Float.parseFloat(values[4]);
                count++;
                if(values[5].equals("Iris-setosa")){
                    setosa_sepel_length[setosacount]=Float.parseFloat(values[1]);
                    setosa_sepel_width[setosacount]=Float.parseFloat(values[2]);
                    setosa_petal_length[setosacount]=Float.parseFloat(values[3]);
                    setosa_petal_width[setosacount]=Float.parseFloat(values[4]);
                    setosacount++;
                }
                else if(values[5].equals("Iris-versicolor")){
                    versicolor_sepel_length[versicolorcount]=Float.parseFloat(values[1]);
                    versicolor_sepel_width[versicolorcount]=Float.parseFloat(values[2]);
                    versicolor_petal_length[versicolorcount]=Float.parseFloat(values[3]);
                    versicolor_petal_width[versicolorcount]=Float.parseFloat(values[4]);
                    versicolorcount++;
                }
                else{
                    verginica_sepel_length[verginicacount]=Float.parseFloat(values[1]);
                    verginica_sepel_width[verginicacount]=Float.parseFloat(values[2]);
                    verginica_petal_length[verginicacount]=Float.parseFloat(values[3]);
                    verginica_petal_width[verginicacount]=Float.parseFloat(values[4]);
                    verginicacount++;
                }
            }
            double sepel_length_mean = calculatemean(sepel_length, count);
            double setosa_sepel_length_mean = calculatemean(setosa_sepel_length,setosacount);
            double setosa_sepel_width_mean = calculatemean(setosa_sepel_width,setosacount);
            double setosa_petal_length_mean = calculatemean(setosa_petal_length,setosacount);
            double setosa_petal_width_mean = calculatemean(setosa_petal_width,setosacount);
            double sepel_width_mean = calculatemean(sepel_width, count);
            double versicolor_sepel_length_mean = calculatemean(versicolor_sepel_length,versicolorcount);
            double versicolor_sepel_width_mean = calculatemean(versicolor_sepel_width,versicolorcount);
            double versicolor_petal_length_mean = calculatemean(versicolor_petal_length,versicolorcount);
            double versicolor_petal_width_mean = calculatemean(versicolor_petal_width,versicolorcount);
            double petal_length_mean = calculatemean(petal_length, count);
            double verginica_sepel_length_mean = calculatemean(verginica_sepel_length,verginicacount);
            double verginica_sepel_width_mean = calculatemean(verginica_sepel_width,verginicacount);
            double verginica_petal_length_mean = calculatemean(verginica_petal_length,verginicacount);
            double verginica_petal_width_mean = calculatemean(verginica_petal_width,verginicacount);
            double petal_width_mean = calculatemean(petal_width, count);
            double sepel_length_mode = calculatemode(sepel_length, count);
            double setosa_sepel_length_mode = calculatemode(setosa_sepel_length, setosacount);
            double setosa_sepel_width_mode = calculatemode(setosa_sepel_width, setosacount);
            double setosa_petel_length_mode = calculatemode(setosa_petal_length, setosacount);
            double setosa_petel_width_mode = calculatemode(setosa_petal_width, setosacount);
            double sepel_width_mode = calculatemode(sepel_width, count);
            double versicolor_sepel_length_mode = calculatemode(versicolor_sepel_length,versicolorcount);
            double versicolor_sepel_width_mode = calculatemode(versicolor_sepel_width,versicolorcount);
            double versicolor_petal_length_mode = calculatemode(versicolor_petal_length,versicolorcount);
            double versicolor_petal_width_mode = calculatemode(versicolor_petal_width,versicolorcount);
            double petel_length_mode = calculatemode(petal_length, count);
            double verginica_sepel_length_mode = calculatemode(verginica_sepel_length,verginicacount);
            double verginica_sepel_width_mode = calculatemode(verginica_sepel_width,verginicacount);
            double verginica_petal_length_mode = calculatemode(verginica_petal_length,verginicacount);
            double verginica_petal_width_mode = calculatemode(verginica_petal_width,verginicacount);
            double petel_width_mode = calculatemode(petal_width, count);
            double sepel_length_min = calculatemin(sepel_length);
            double setosa_sepel_length_min = calculatemin(setosa_sepel_length);
            double setosa_sepel_width_min = calculatemin(setosa_sepel_width);
            double setosa_petal_length_min = calculatemin(setosa_petal_length);
            double setosa_petal_width_min = calculatemin(setosa_petal_width);
            double sepel_width_min = calculatemin(sepel_width);
            double versicolor_sepel_length_min = calculatemin(versicolor_sepel_length);
            double versicolor_sepel_width_min = calculatemin(versicolor_sepel_width);
            double versicolor_petal_length_min = calculatemin(versicolor_petal_length);
            double versicolor_petal_width_min = calculatemin(versicolor_petal_width);
            double petal_length_min = calculatemin(petal_length);
            double verginica_sepel_length_min = calculatemin(verginica_sepel_length);
            double verginica_sepel_width_min = calculatemin(verginica_sepel_width);
            double verginica_petal_length_min = calculatemin(verginica_petal_length);
            double verginica_petal_width_min = calculatemin(verginica_petal_width);
            double petal_width_min = calculatemin(petal_width);
            double sepel_length_max = calculatemax(sepel_length);
            double setosa_sepel_length_max = calculatemaxx(setosa_sepel_length);
            double setosa_sepel_width_max = calculatemaxx(setosa_sepel_width);
            double setosa_petal_length_max = calculatemaxx(setosa_petal_length);
            double setosa_petal_width_max = calculatemaxx(setosa_petal_width);
            double sepel_width_max = calculatemax(sepel_width);
            double versicolor_sepel_length_max = calculatemaxx(versicolor_sepel_length);
            double versicolor_sepel_width_max = calculatemaxx(versicolor_sepel_width);
            double versicolor_petal_length_max = calculatemaxx(versicolor_petal_length);
            double versicolor_petal_width_max = calculatemaxx(versicolor_petal_width);
            double petal_length_max = calculatemax(petal_length);
            double verginica_sepel_length_max = calculatemaxx(verginica_sepel_length);
            double verginica_sepel_width_max = calculatemaxx(verginica_sepel_width);
            double verginica_petal_length_max = calculatemaxx(verginica_petal_length);
            double verginica_petal_width_max = calculatemaxx(verginica_petal_width);
            double petal_width_max = calculatemax(petal_width);
            System.out.println("******************************OVERALL SUMMARY*******************************");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| STATISTIC |\tSEPEL LENGTH |\tSEPEL WIDTH |\tPETAL LENGTH |\tPETAL WIDTH|");
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("| MEAN       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",sepel_length_mean, sepel_width_mean,petal_length_mean,petal_width_mean);
            System.out.printf("| MEDIAN     |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",sepel_length[calculatemedian(sepel_length)], sepel_width[calculatemedian(sepel_width)],petal_length[calculatemedian(petal_length)],petal_width[calculatemedian(petal_width)]);
            System.out.printf("| MODE       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",sepel_length_mode, sepel_width_mode, petel_length_mode, petel_width_mode);
            System.out.printf("| MINIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",sepel_length_min, sepel_width_min, petal_length_min, petal_width_min);
            System.out.printf("| MAXIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",sepel_length_max, sepel_width_max, petal_length_max, petal_width_max);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("******************************IRIS-SETOSA***********************************");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| STATISTIC |\tSEPEL LENGTH |\tSEPEL WIDTH |\tPETAL LENGTH |\tPETAL WIDTH|");
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("| MEAN       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",setosa_sepel_length_mean, setosa_sepel_width_mean, setosa_petal_length_mean, setosa_petal_width_mean);
            System.out.printf("| MEDIAN     |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",setosa_sepel_length[calculatemedian(setosa_sepel_length)], setosa_sepel_width[calculatemedian(setosa_sepel_width)], setosa_petal_length[calculatemedian(setosa_petal_length)], setosa_petal_width[calculatemedian(setosa_petal_width)]);
            System.out.printf("| MODE       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",setosa_sepel_length_mode, setosa_sepel_width_mode, setosa_petel_length_mode, setosa_petel_width_mode);
            System.out.printf("| MINIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",setosa_sepel_length_min, setosa_sepel_width_min, setosa_petal_length_min, setosa_petal_width_min);
            System.out.printf("| MAXIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",setosa_sepel_length_max, setosa_sepel_width_max, setosa_petal_length_max, setosa_petal_width_max);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("******************************IRIS-VERSICOLOR*******************************");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| STATISTIC |\tSEPEL LENGTH |\tSEPEL WIDTH |\tPETAL LENGTH |\tPETAL WIDTH|");
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("| MEAN       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",versicolor_sepel_length_mean, versicolor_sepel_width_mean, versicolor_petal_length_mean, versicolor_petal_width_mean);
            System.out.printf("| MEDIAN     |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",versicolor_sepel_length[calculatemedian(versicolor_sepel_length)], versicolor_sepel_width[calculatemedian(versicolor_sepel_width)], versicolor_petal_length[calculatemedian(versicolor_petal_length)], versicolor_petal_width[calculatemedian(versicolor_petal_width)]);
            System.out.printf("| MODE       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",versicolor_sepel_length_mode, versicolor_sepel_width_mode, versicolor_petal_length_mode, versicolor_petal_width_mode);
            System.out.printf("| MINIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",versicolor_sepel_length_min, versicolor_sepel_width_min, versicolor_petal_length_min, versicolor_petal_width_min);
            System.out.printf("| MAXIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",versicolor_sepel_length_max, versicolor_sepel_width_max, versicolor_petal_length_max, versicolor_petal_width_max);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("******************************IRIS-VERGINICA********************************");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| STATISTIC |\tSEPEL LENGTH |\tSEPEL WIDTH |\tPETAL LENGTH |\tPETAL WIDTH|");
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("| MEAN       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",verginica_sepel_length_mean, verginica_sepel_width_mean, verginica_petal_length_mean, verginica_petal_width_mean);
            System.out.printf("| MEDIAN     |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",verginica_sepel_length[calculatemedian(verginica_sepel_length)], verginica_sepel_width[calculatemedian(verginica_sepel_width)], verginica_petal_length[calculatemedian(verginica_petal_length)], verginica_petal_width[calculatemedian(verginica_petal_width)]);
            System.out.printf("| MODE       |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",verginica_sepel_length_mode, verginica_sepel_width_mode, verginica_petal_length_mode, verginica_petal_width_mode);
            System.out.printf("| MINIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",verginica_sepel_length_min, verginica_sepel_width_min, verginica_petal_length_min, verginica_petal_width_min);
            System.out.printf("| MAXIMUM    |\t%.2f\t     |\t%.2f\t     |\t%.2f\t     |\t%.2f       |%n",verginica_sepel_length_max, verginica_sepel_width_max, verginica_petal_length_max, verginica_petal_width_max);
            System.out.println("----------------------------------------------------------------------------");
        }        
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static double calculatemean(float[] arr, int count){
        double summ =0.0;
        for(int i=0;i<arr.length;i++){
            summ += arr[i];
        }
        return summ/count;
    }
    public static int calculatemedian(float[] median){
        for(int i=0;i<median.length-1;i++){
            int min=i;
            for(int j=i+1;j<median.length;j++){
                if(median[j]<median[min]){
                    min=j;
                }
            }
            float temp = median[min];
            median[min]=median[i];
            median[i]=temp;
        }
        if(median.length%2==0)
            return (int)(median.length/2);
        else
            return (int)(median.length+1)/2;
    }
    public static float calculatemode(float[] data, int n){
        float mode =0;
        int maxcount =0;
        for(int i=0;i<n;i++){
            int counts =0;
            for(int j=0;j<n;j++){
                if(data[i]==data[j]){
                    counts++;
                }
            }
            if(counts>maxcount){
                maxcount = counts;
                mode = data[i];
            }
        }
        return mode;
    }
    public static float calculatemin(float[] data){
        Arrays.sort(data);
        return data[0];
    }
    public static float calculatemax(float[] data){
        Arrays.sort(data);
        return data[149];
    }
    public static float calculatemaxx(float[] data){
        Arrays.sort(data);
        return data[49];
    }
}
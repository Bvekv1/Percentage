package formula;

public class CalculatePercentage {
    private  int marksAPI, marksAndroid, marksIPC;

    public CalculatePercentage(int marksAPI, int marksAndroid, int marksIPC) {
        this.marksAPI = marksAPI;
        this.marksAndroid = marksAndroid;
        this.marksIPC = marksIPC;
    }

    public int getMarksAPI() {
        return marksAPI;
    }

    public void setMarksAPI(int marksAPI) {
        this.marksAPI = marksAPI;
    }

    public int getMarksAndroid() {
        return marksAndroid;
    }

    public void setMarksAndroid(int marksAndroid) {
        this.marksAndroid = marksAndroid;
    }

    public int getMarksIPC() {
        return marksIPC;
    }

    public void setMarksIPC(int marksIPC) {
        this.marksIPC = marksIPC;
    }

    public int Percentage(){
        return ((marksAPI+marksAndroid+marksIPC)/3);
    }
}

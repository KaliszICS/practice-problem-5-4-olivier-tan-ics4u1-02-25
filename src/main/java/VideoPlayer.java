public class VideoPlayer implements Player {
  
    protected String video;
    protected boolean onOff;
    
    protected int currentTime;
    protected int volume;

    public VideoPlayer(String str) {
        this.video = str;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
       
    }
    public void stop() {
        if (onOff) {
            onOff = false;
        }
    
    }
    public void start() {
        if (!onOff) {
            onOff = true;
        }
    }

   
    public boolean getOnOff() {
        return onOff;
    }

    public void volumeDown() {
        volume -= 5;
    }


    public void volumeUp() {
        volume += 5;
    }

    

    public int getVolume() {
        return volume;
    }

    public void fastForward() {
        currentTime += 5;
    }

    public void rewind() {
        currentTime -= 5;
    }

    public int getCurrentTime() {
        return currentTime;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
    
}

class MusicPlayer implements Player {
    
    protected String[] musicList;
    protected String currentSong; 
    protected boolean onOff;
       
    protected int volume;
    protected int currentSongIndex;

    public MusicPlayer(String[] list) {
        this.musicList = list;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }

    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            currentSong = musicList[0];
            currentSongIndex = 0;
        }
    }

    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }

    public boolean getOnOff() {
        return onOff;
    }

    @Override
    public void volumeUp() {
        volume++;
    }
 
    @Override
    public void volumeDown() {
        volume--;
    }

    public int getVolume() {
        return volume;
    }
    
    public void next() {
        currentSongIndex++;
        currentSong = musicList[currentSongIndex];
    }


    public void previous() {
        currentSongIndex--;
        currentSong = musicList[currentSongIndex];
    }
   
    public String getCurrentSong() {
        return currentSong;
    }

}

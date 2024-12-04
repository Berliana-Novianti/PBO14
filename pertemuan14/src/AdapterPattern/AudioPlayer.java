package AdapterPattern;

// AudioPlayer class that implements MediaPlayer
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // In-built support for playing mp3 files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file: " + fileName);
        }
        // MediaAdapter provides support for other file types like vlc and mp4
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}


package anomalous.anomalous.message;

/**
 * @author zhoumin
 * @create 2018-07-11 10:19
 */
public class MusicMessage extends BaseMessage {
    /**
     * 音乐
     */
    private Music Music;

    public anomalous.anomalous.message.Music getMusic() {
        return Music;
    }

    public void setMusic(anomalous.anomalous.message.Music music) {
        Music = music;
    }
}

package uk.co.thomasc.steamkit.base.generated.steamlanguage;


public enum EPublishedFileVisibility {

    Public(0),
    FriendsOnly(1),
    Private(2),

    ;

    private final int code;

    EPublishedFileVisibility(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPublishedFileVisibility from(int code) {
        for (EPublishedFileVisibility e : EPublishedFileVisibility.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}

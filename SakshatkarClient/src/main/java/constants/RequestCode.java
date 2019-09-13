package constants;

public enum RequestCode {

    LOGIN_REQUEST,
    SIGNUP_REQUEST,
    PEERLIST_REQUEST,
    SEARCH_REQUEST,
    FILEUPLOAD_REQUEST,
    FILECHECK_REQUEST,
    AVAILABLEPIECE_REQUEST,
    FILEDOWNLOAD_REQUEST,
    DOWNLOADEDFILES_REQUEST,
    SHAREDFILES_REQUEST,
    UPDATEUSERHISTORY_REQUEST,
    PIECEDOWNLOAD_REQUEST,
    FILEDOWNLOADCOMPLETE_REQUEST;

    RequestCode(){
        this.toString();
    }
}
class BaseApiService {

  BaseApiService(String url) {
    this.url = url;
  }

  String url;

  void get() {
    System.out.println("Getting data from " + this.url);
  }

  void post() {
    System.out.println("Posting data to " + this.url);
  }
}

class AuthenticationApiService extends BaseApiService {

  AuthenticationApiService() {
    super("http:google.com");
  }

  @Override
  void get() {
    System.out.println("Executing Authentication");
    super.get();
  }
}

class Main {

  public static void main(String [] args) {
    AuthenticationApiService auth = new AuthenticationApiService();
    auth.get();
  }
}

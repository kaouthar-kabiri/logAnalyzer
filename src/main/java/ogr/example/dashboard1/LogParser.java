package ogr.example.dashboard1;
import org.example.TimeStamp;
import org.example.UserAgent;
import org.example.dashboard1.LogRecord;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LogParser {

    private static String regex = "^([\\d.]+) (\\S+) (\\S+) \\[([\\w:/]+\\s[+-]\\d{4})\\] \"(.+?)\" (\\d{3}) (\\d+) \"([^\"]+)\" \"(.+?)\"";

    private static Pattern logPattern = Pattern.compile(regex);


    public static LogRecord parseLog(String logLine) {
        Matcher logMatcher = logPattern.matcher(logLine);
        if(!logMatcher.matches()) {
            return null;
        }
        String ipAddress = logMatcher.group(1);
        String clientId = logMatcher.group(2);
        String userId = logMatcher.group(3);
        String creationTime = logMatcher.group(4);
        // C'est pour analyser le 5eme champs et en tirer les elements :method,uri,protocol
        String request= logMatcher.group(5);
        String requestRegex="";
        //
        String method = logMatcher.group(5);
        String uri = logMatcher.group(6);
        String protocol = logMatcher.group(7);
        //
        String statusCode = logMatcher.group(6);
        String size = logMatcher.group(7);
        String domainName = logMatcher.group(9);
        String userAgent = logMatcher.group(9);

        System.out.println(ipAddress);
        System.out.println(clientId);
        System.out.println(userId);
        System.out.println(creationTime);
        System.out.println(method);
        System.out.println(uri);
        System.out.println(protocol);
        System.out.println(statusCode);
        System.out.println(size);
        System.out.println(domainName);
        System.out.println(userAgent);


        return new org.example.dashboard1.LogRecord(ipAddress, clientId, userId, timestampParser(creationTime), method, protocol, statusCode, sizeParser(size),domainName, userAgentParser(userAgent));
    }
    public static UserAgent userAgentParser(String userAgent){
        String regex="^[a-z]|[A-Z]{3} ";
        Pattern userAgentPattern = Pattern.compile(regex);
        Matcher userAgentMatcher = userAgentPattern.matcher(userAgent);
        String operatingSystem="";
        String browser="";
        String operatingSystemVersion="";
        return new UserAgent(operatingSystem,browser,operatingSystemVersion);


    }
    public static double  sizeParser(String size){ return Double.parseDouble(size);}
    public static TimeStamp timestampParser(String timestamp){

        // String regex="(0[1-9]|[1-2][0-9]|3[0-1])/\\//([a-z]|[A-Z]){3}/\\//[0-9]{4}:(2[0-3]|[01][0-9]):[0-5][0-9]:[0-5][0-9] ((`+' | `-')[0-9]{4})";
        //String regex="^(\\d{4})\\/(\\d{2})\\/(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})([+-])(\\d{2}):(\\d{2})$";

        String regex="^(\\d{2}\\/\\d{2}\\/\\d{4}\\s\\d{2}:\\d{2}:\\d{2}\\s[a-zA-Z]{3}\\/[a-zA-Z]{3})$";
        Pattern timeStampPattern = Pattern.compile(regex);
        Matcher timeStampMatcher = timeStampPattern.matcher(timestamp);

        String day=timeStampMatcher.group(1);
        String month=timeStampMatcher.group(2);
        String year=timeStampMatcher.group(3);
        String hour=timeStampMatcher.group(4);
        String minute=timeStampMatcher.group(5);
        String second=timeStampMatcher.group(6);
        System.out.println(day+" "+month+" "+year+" "+hour+" "+minute);

        return new TimeStamp(day, month, year, hour, minute, second);
    }

    public static void main(String[] args) {
        // UserAgentStringParser parser = UADetectorServiceFactory.getResourceModuleParser();

        parseLog("127.0.0.1 - - [07/Mar/2022:23:34:35 +0100] \"GET /dashboard/ HTTP/1.1\" 200 7576 \"-\" \"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:97.0) Gecko/20100101 Firefox/97.0\"");
    }

}


package info.anwesha2k18.iitp.data;

/**
 * Created by mayank on 26/11/17.
 */

public class EventData {
    int fee, day, size, id, code;
    String name, tagline, date, time, venue, organisers, short_desc, long_desc;
    String toDisplay_short, toDisplay_long;

    EventData(int id, String name, int fee, int day, int size, int code, String tagline, String date, String time, String venue, String organisers, String short_desc, String long_desc ) {
        this.id = id;
        this.name = name;
        this.short_desc = short_desc;
        this.fee = fee;
        this.day = day;
        this.code = code;
        this.size = size;
        this.tagline = tagline;
        this.date = date;
        this.time = time;
        this.venue = venue;
        this.organisers = organisers;
        this.long_desc = long_desc;
        toDisplay_short = filterLongDesc((short_desc));
        toDisplay_long = filterLongDesc((long_desc));
    }

    public String filterLongDesc(String longdesc) {
        longdesc = longdesc.replaceAll("<[^>]*>", "");
        longdesc = longdesc.replaceAll("&nbsp;", "");
        longdesc = longdesc.replaceAll("&ldquo;", "\n");
        longdesc = longdesc.replaceAll("\r", "\n");
        longdesc = longdesc.replaceAll("\n{2,}", "\n\n");
        longdesc = longdesc.trim();
        //longdesc = longdesc.substring(longdesc.indexOf("\n"));
        //longdesc = longdesc.trim();

        return longdesc;
    }
}

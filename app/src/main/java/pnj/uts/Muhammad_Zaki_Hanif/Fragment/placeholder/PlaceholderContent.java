package pnj.uts.Muhammad_Zaki_Hanif.Fragment.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaceholderContent {

    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

        private static final int COUNT = 25;
        private static final String DESKRIPSI= "Barcelona Siapkan 4 Cara Boyong Robert Lewandowski ke Camp Nou.";

        static {
            // Add some sample items.
            for (int i = 1; i <= COUNT; i++) {
                addItem(createPlaceholderItem(i));
            }
        }

        private static void addItem(PlaceholderItem item) {
            ITEMS.add(item);
            ITEM_MAP.put(item.id, item);
        }

        private static PlaceholderItem createPlaceholderItem(int position) {
            return new PlaceholderItem(String.valueOf(position), "Barcelona sudah menyiapkan 4 cara agar Robert Lewandowski gabung di musim depan.\n", makeDetails());
        }

        private static String makeDetails() {
            StringBuilder builder = new StringBuilder();
            builder.append(DESKRIPSI).append("\n\nsource: \nhttps://www.liputan6.com/bola/read/4968130/barcelona-siapkan-4-cara-boyong-robert-lewandowski-ke-camp-nou");
            return builder.toString();
        }
    public static class PlaceholderItem {
        public final String id;
        public final String content;
        public final String details;

        public PlaceholderItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }


        @Override
        public String toString() {
            return content;
        }
    }
}

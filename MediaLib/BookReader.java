public class BookReader
{
        public static void main()
        {
            String songInfo = MediaFile.readString();
            while (songInfo != null)
            {
            }
            System.out.println("Line #" + lineNum);
        }
}

/*             for (String songInfo = MediaFile.readString(); songInfo != ""; songInfo = songInfo + "") {
            System.out.println(MediaFile.readString());
        }
*/

            /* while (songInfo != null)
            {
                songInfo = MediaFile.readString();
                int separator = songInfo.indexOf("|");
                int len = songInfo.length();
                System.out.print("Title:");
                System.out.println(songInfo.substring(0, separator));
                System.out.print("Rating: ");
                System.out.println(songInfo.substring(separator + 1, len));
                
            } */
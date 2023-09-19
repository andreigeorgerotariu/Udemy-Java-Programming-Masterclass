package timbuchalka.collections.linkedList.songPlaylistChallenge;

//Create a program that implements a playlist for songs
//Create a Song class having Title and Duration for a song
//The program will have an Album class containing a list of songs
//The album will be stored in an ArrayList
//Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
//Once the songs have been added to the playlist, create a menu of options to:-
//Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
//List the song in the playlist
//A song must exist in an album before it can be added to the playlist ( so you can only play songs that you own.
//Hint: To replay a song, consider what happened when we went back and forth from a city before we started tracking
// the direction we were going.
//As an optional extra, provide an option to remove the current song from the playlist (hint: listIterator.remove()

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Meteora", "LinkinPark");
        album.addSong("Foreword", 0.13);
        album.addSong("Don't Stay", 3.07);
        album.addSong("Somewhere I Belong", 3.33);
        album.addSong("Lying from You", 2.55);
        album.addSong("Hit the Floor", 2.44);
        album.addSong("Easier to Run", 3.24);
        album.addSong("Faint", 2.42);
        album.addSong("Figure.09", 3.17);
        album.addSong("Breaking the Habit", 3.16);
        album.addSong("From the Inside", 2.53);
        albums.add(album);

        album = new Album("Hybrid Theory", "Linkin Park");
        album.addSong("Papercut", 3.04);
        album.addSong("One Step Closer", 2.35);
        album.addSong("With You", 3.23);
        album.addSong("Points of Authority", 3.20);
        album.addSong("Crawling", 2.29);
        album.addSong("Runaway", 3.03);
        album.addSong("By Myself", 3.09);
        album.addSong("In the End", 3.36);
        album.addSong("A Place for My Head", 3.04);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Somewhere I Belong", playlist);
        albums.get(0).addToPlaylist("Faint", playlist);
        albums.get(0).addToPlaylist("Breaking the Habit", playlist);
        albums.get(0).addToPlaylist(9, playlist);

        albums.get(1).addToPlaylist(1, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(6, playlist);
        albums.get(1).addToPlaylist("In the End", playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying: " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Available actions: \n press ");
        System.out.println("0 - to quit \n" +
                "1 - to play the next song \n" +
                "2 - to play the previous song \n" +
                "3 - to replay the current song \n" +
                "4 - list the songs in the playlist \n" +
                "5 - print available actions \n" +
                "6 - remove current song from playlist ");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================================");
    }
}
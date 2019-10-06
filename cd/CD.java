package cd;

import java.lang.reflect.InvocationTargetException;

import unorderedArray.UnorderedArray;

@SuppressWarnings("hiding")

public class CD{
	public static final int CAPACITY=20;
	private final String name;
	private final UnorderedArray<Song> songs;
	private final short year;


	/**
	 * @param  cd
	 *                                       The CD to copy
	 * @throws NoSuchMethodException
	 *                                       e
	 * @throws InstantiationException
	 *                                       e
	 * @throws IllegalAccessException
	 *                                       e
	 * @throws InvocationTargetException
	 *                                       e
	 */
	public CD(final CD cd) throws NoSuchMethodException, InstantiationException,
	IllegalAccessException, InvocationTargetException{
		this(cd.name, cd.year, new UnorderedArray<>(cd.songs, true));
	}

	/**
	 * @param name
	 *                     The name of the CD
	 * @param year
	 *                     The year the CD was made
	 * @param capacity
	 *                     The amount of songs it can hold
	 * @param songs
	 *                     The songs it holds
	 */
	public CD(
		final String name, final short year, final int capacity,
		final Song... songs
		){
		this(name, year, new UnorderedArray<>(capacity, songs));
	}


	/**
	 * Defaults the capacity to {@code CD.CAPACITY}
	 *
	 * @param name
	 *                  The name of the CD
	 * @param year
	 *                  The year the CD was made
	 * @param songs
	 *                  The songs it holds
	 */
	public CD(final String name, final short year, final Song... songs){
		this(name, year, CD.CAPACITY, songs);
	}

	/**
	 * Creates the CD with the given {@link UnorderedArray}
	 *
	 * @param name
	 *                  The name of the CD
	 * @param year
	 *                  The year the CD was made
	 * @param songs
	 *                  The songs it holds
	 */
	public CD(
		final String name, final short year, final UnorderedArray<Song> songs
		){
		this.name=name;
		this.songs=songs;
		this.year=year;
	}

	/**
	 * @return The capacity of the CD
	 * @see    unorderedArray.UnorderedArray#capacity()
	 */
	public int capacity(){
		return this.songs.capacity();
	}

	/**
	 * @param  value
	 *                   The song to delete
	 * @return       A boolean indicating success
	 * @see          unorderedArray.UnorderedArray#delete(java.lang.Object)
	 */
	public boolean delete(final String title){
		return this.deleteIndex(this.findIndex(title));
	}

	/**
	 * @param index The index of the song to remove
	 * @return The removed song
	 * @see unorderedArray.UnorderedArray#deleteIndex(int)
	 */
	public boolean deleteIndex(final int index){
		return this.songs.deleteIndex(index);
	}


	/**
	 * @param  title
	 *                   The title to find in the CD
	 * @return       The song found<br>
	 *               {@code null} if not found
	 */
	public Song find(final String title){
		final int i=this.findIndex(title);
		return i<0?null:this.get(i);
	}


	/**
	 * @param  title
	 *                   The title to find in the CD
	 * @return       The index of the found song<br>
	 *               {@code -1} if not found
	 */
	public int findIndex(final String title){
		for(int i=0; i<this.songs.size(); i++){
			if(this.get(i).getTitle().equals(title))return i;
		}
		return -1;
	}

	/**
	 * @param index
	 * @return
	 * @see unorderedArray.UnorderedArray#get(int)
	 */
	public Song get(final int index){
		return this.songs.get(index);
	}


	/**
	 * @param value
	 * @return
	 * @see unorderedArray.UnorderedArray#insert(java.lang.Object)
	 */
	public boolean insert(final Song value){
		return this.songs.insert(value);
	}

	/**
	 * @param i
	 * @param value
	 * @see unorderedArray.UnorderedArray#set(int, java.lang.Object)
	 */
	public void set(final int i, final Song value){
		this.songs.set(i, value);
	}

	/**
	 * @return
	 * @see unorderedArray.UnorderedArray#size()
	 */
	public int size(){
		return this.songs.size();
	}

	@Override
	public String toString(){
		final StringBuilder builder=new StringBuilder();
		builder.append(this.name).append("    ").append(this.year);
		builder.append("\n");
		for(int i=0; i<this.songs.size(); i++){
			builder.append(i);
			builder.append("\t");
			builder.append(this.get(i));
			builder.append("\n");
		}
		return builder.toString();
	}

}

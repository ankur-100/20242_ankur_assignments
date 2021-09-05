class books<T> {
    private arr: T[] =[];

    getbook(arr: T[]) {
        return this.arr =arr;
    }

    addbook(book : T) {
        this.arr.push(book);
    }
}

    let id = new books<number>();
    id.addbook(1);
    id.addbook(2);
    id.addbook(3);
    id.addbook(4);

    let title = new books<string>();
    title.addbook("Mag1");
    title.addbook("Mag2");
    title.addbook("Mag2");
    title.addbook("Mag2");
    title.addbook("Mag2");

    let author = new books<string>();
    author.addbook("amish");
    author.addbook("messi");
    author.addbook("qwerty");

    console.log(id);
    console.log(title ,author);
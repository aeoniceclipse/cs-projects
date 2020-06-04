fn main() {
    let mut num = 0;

//  let result =
        while num != 10 {
            println!("{}", num);

            num += 1;

//          if num == 10 {
//              break num;
//          }
        };

//  println!("The result is {}", result);

    let arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];

    for val in arr.iter() {
        println!("val {}", val);
    }

    for each in 1..10 {
        println!("# {}", each);
    }
    println!("# 10");

}

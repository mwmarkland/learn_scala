=Chapter One.

Real basics. One thing I don't have a good answer for is the last
question in the exercises. One thing I noticed is that I can partially
apply `take` but not `substring` so maybe that is what he's getting
at?

Fun messing around in the REPL.

=Chapter Two

When doing the readLine() and readInt() calls in section 2.4, got a deprecation message.

```
scala> val name = readLine("Your name: ")
<console>:10: warning: method readLine in trait DeprecatedPredef is deprecated: Use the method in `scala.io.StdIn`
```

So I then did

```scala
val name = scala.io.StdIn.readLine("Your name: ")
```
and didn't get the message.

Remember everything is an expression. Blocks return their last expression. And have the type of their last expression, which could be `Unit`.

`for` statements (note *statement* not *expression*) can have all sorts of interesting things shoved into what a C++ programmer would consider the initialization. I think this is the syntax that was confusing me earlier. Need to spend more time on this.

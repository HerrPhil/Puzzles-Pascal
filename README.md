# Puzzles-Pascal

##Print Pascal's Triangle

Pascal’s triangle is a triangular array of binomial coefficients.

That is, every value is a binomial coefficient.

The rows of the triangle start with row n=0.

The entries in each row are numbers from the left starting at k=0.

The zero identity of zero factorial is why the n choose 0 binomial coefficients have a value of 1.

Because zero has no numbers less than it but is still in and of itself a number,
there is but one possible combination of how that data set can be arranged: it cannot.
This still counts as a way of arranging it, so by definition, a zero factorial is equal to one,
just as 1! is equal to one because there is only a single possible arrangement of this data set.

Therefore,

- the first row is 0 choose 0 = 1.
- the second row is 1 choose 0 = 1, and 1 choose 1 = 1
- the third row is 2 choose 0 = 1, 2 choose 1 = 2, and 2 choose 2 = 1
- the fourth row is 3 choose 0 = 1, 3 choose 1 = 3, 3 choose 2 = 3, and 3 choose 3 = 1

and so on.

As well, Pascal's rule says that elements in the nth row can be calculated by the n-1 values above it.

n choose k = n-1 choose k-1 + n-1 choose k

for any non-negative integer n and any integer 0<=k<=n.

Write a function that takes an integer value N as input and prints the first N lines of Pascal’s triangle.


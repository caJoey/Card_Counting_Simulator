# Card Counting Simulator

Description: This program simulates card counting and gameplay for blackjack. It prints the summary of each hand with information about what the count is as well. This can be used to calculate what edge a user has using [testing.txt](testing.txt) and [average.java](src/average.java).

Get Started:
Download and unzip in the main part of repository.<br />
The 3 important java files are in the src folder but the most imporant is [playingSim.java](src/playingSim.java)<br />

NOTE: playingSim uses the hi-lo counting strategy but the way I do it is the opposite so that is what this uses:
- 2-6 = -1
- 7-9 = 0
- 10s and aces = +1
<br />
Blackjack rules in this program:
- double deck
- dealer shuffles after 1 deck
- 5-80 1-16 bet spread
- H17
- no DAS
- player splits to 1 hand max
- no late surrender
<br /><br />
Comments are included in code to edit some of these.<br />

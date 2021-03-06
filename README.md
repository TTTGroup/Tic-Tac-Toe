Updated Original App Design Project - README Template

===

# Tic Tac Toe
## Table of Contents
1. [Overview](#Overview)
2. [Product Spec](#Product-Spec)
3. [Wireframes](#Wireframes)
4. [Schema](#Schema)

## Overview
### Description
Tic Tac Toe done by the use of recycler views.

### App Evaluation
- **Category:**
- **Mobile:** Touchscreen game made for android
- **Story:** This app can be used to teach children basic planning skills
- **Market:** Rated E for everyone
- **Habit:** If people enjoy the game, they will play daily.
- **Scope:** This will be very easy. It is clearly defined, but a stripped down version would not be much fun to build.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**
- [X] Users can view a start screen with a picture and a game explanation
- [X] Users create a 3x3 grid as a game screen
- [X] Users can click on boxes
- [X] User 1 automatically assigned to X's
- [X] User 2 automatically assigned to O's
- [X] Auto alternate between User 1's and User 2's turns
- [X] User 1 can win the game
- [X] User 2 can win the game
- [X] Users can reach a draw
- [X] Users can click "reset" button to start a new game
- [X] Users Scoreboard updates at the end of each game
- [X] Users can exit the game
- [X] Grid automatically resets when a game ends

**Optional Nice-to-have Stories**
- [X] Confirmation screen from Exit button
- [X] Portrait and Landscape mode 
- [ ] Persistence between Portrait and Landscape mode
- [ ] Users have access to an options menu

### 2. Screen Archetypes

* Start Screen
   * A Welcome screen
* Creation Screen
    * Game starts
    * X's and O's inserted
    * Tic Tac Toe game in progress
    * User's scores

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Welcome/Start Menu
* Gamescreen

**Flow Navigation** (Screen to Screen)

* Welcome
   * Tic Tac Toe Gamescreen
* Tic Tac Toe Gamescreen
   * Reset widget
   * Winner's count
   * Loser's count

## Build Progress (Gif's)
https://recordit.co/FqzeUQy2Em
https://recordit.co/HWWES4DDOV

## Wireframes
https://gyazo.com/b8ccd9c8cd2446ad13825c1091bd98f0

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
### Models
| Property | Type     | Description                                        |
| -------- | -------- | -----------------------------------------------    |
| ObjectId | Widget   | Calling widget by Id                               |
| Grid     | Button   | 3x3 array representing postions in Tic-Tac-Toe     |
| Toast    | String   | Inform user of win/loss                            |
| Score    | Number   | Number of Wins                                     |

### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

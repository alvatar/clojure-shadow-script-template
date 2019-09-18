# Shadow-cljs script base project

## Live coding / hot code reloading

In Emacs:

```
M-x cider-jack-in-cljs
```
Select shadow > :script (or the id of the target if it's different)

Then in a terminal:

```
node yang-openapi
```

## Add/remove Javascript dependencies

This is all that is required for Javascript dependencies. It is managed by `npm`.

```
npm install js-dep
```

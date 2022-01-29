//using things route

const express=require("express")
const app=express()
//to access multiple routes
const userRouter=require("./things")
const userRouter2=require("./xroute")
app.use("/things",userRouter)
app.use("/xroute",userRouter2)

app.listen(3030)
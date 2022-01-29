var express = require ('express')
const router = express.Router()
var app=express()

router.get("/id",(req,res)=>{
    res.send(req.params.id);
})
router.put("/id",(req,res)=>{
    res.send(req.params.id);
})
router.delete("/id",(req,res)=>{
    res.send(req.params.id);
})


//shortening code

router
  .route("/:id")
  .get((req, res) => {
    console.log(req.user)
    res.send(`Get User With ID ${req.params.id}`)
  })
  .put((req, res) => {
    res.send(`Update User With ID ${req.params.id}`)
  })
  .delete((req, res) => {
    res.send(`Delete User With ID ${req.params.id}`)
  })

const users = [{ name: "Kyle" }, { name: "Sally" }]
router.param("id", (req, res, next, id) => {
  req.user = users[id]
  next()
})


module.exports = router
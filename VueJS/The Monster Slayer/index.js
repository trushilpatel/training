const game = new Vue({
  el: "#game",
  activity: [],
  data: {
    startGame: false,
    player: {
      name: "Trushil",
      life: 100
    },
    monster: {
      name: "Rave",
      life: 100
    }

  },

  created: {
    newName() {
      return this.player.name
    }

  },

  methods: {
    attack() {
      this.player.life -= Math.floor(Math.random() * 25)
      this.monster.life -= Math.floor(Math.random() * 25)

      if (this.player.life <= 0) {
        this.player.life = 0;
        alert(this.player.name + " Lost Game ")

        this.startGame = false
      }
      else if (this.monster.life <= 0) {
        this.monster.life = 0;
        alert(this.monster.name + " Lost Game ")

        this.startGame = false
      }

    },

    specialAttack() {
      this.player.life -= Math.floor(Math.random() * 10)
      this.monster.life -= Math.floor(Math.random() * 50)

      if (this.player.life <= 0) {
        this.player.life = 0;
        alert(this.player.name + " Lost Game ")

        this.giveUp()

      }
      else if (this.monster.life <= 0) {
        this.monster.life = 0;
        alert(this.monster.name + " Lost Game ")

        this.giveUp()
      }
    },

    heal() {
      this.player.life += Math.floor(Math.random() * 25)
      this.player.life -= Math.floor(Math.random() * 25)

      if (this.player.life <= 0) {
        this.player.life = 0;
        alert(this.player.name + " Lost Game ")

        this.startGame = false
      }
      else if (this.monster.life <= 0) {
        this.monster.life = 0;
        alert(this.monster.name + " Lost Game ")

        this.startGame = false
      }
      if (this.player.life > 100) {
        this.player.life = 100;
      }
    },
    giveUp() {
      this.startGame = false;
      this.player.life = 100;
      this.monster.life = 100;
    }
  },
})

console.log(game)
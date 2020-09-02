<template>
  <div>
    <template  v-for="name in serverNames" >
      <serverItem :serverName="name" :key="name" @clicked="clicked($event)"/>
    </template>
  </div>
</template>

<script src="./serverList.js"></script>

<style lang="stylus" scoped src='./serverList.css'></style>
